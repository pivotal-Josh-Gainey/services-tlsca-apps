

module.exports = {
    run: function () {
        var amqp = require('amqplib/callback_api');
        var VCAPTEST = require('./VCAPTEST');
        const fs = require('fs');

        var vcaps_services = JSON.parse(process.env.VCAP_SERVICES);
        var uri = vcaps_services['p.rabbitmq'][0].credentials.uri;

        console.log(uri);

        connectLocal();

        function connectLocal(){

            amqp.connect(uri,function(error0, connection) {

                if (error0) {
                    console.log(error0.message);
                    console.log(error0.toString());
                }

                connection.on("error", function(err) {
                    if (err.message !== "Connection closed unexpectadly, reconnecting.") {
                        connectLocal()
                        clearInterval(interval)
                    }
                });

                connection.createChannel(function(error1, channel) {

                    interval = setInterval(sendmessages, 5000);

                    if (error1) {
                        console.log(error1.message);
                        console.log(error1.toString());
                    }


                    function sendmessages(){
                        channel.assertQueue("NodeAppQueue", {
                            durable: false
                        });
                        console.log("Connection active - message sent at " + Date.now());
                        channel.sendToQueue("NodeAppQueue", Buffer.from("NodeAppQueue"));
                    }
                });
            });
        }

    },
};

