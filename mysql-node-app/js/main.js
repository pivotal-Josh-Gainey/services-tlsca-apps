

module.exports = {
    run: function () {
        var mysql = require('mysql');
        var vcaptest = require('./VCAPTEST');
        var mysql_creds = {} ;
        var vcap_services = undefined ;
        var fs = require('fs');
        var fs = require('fs');


        if (process.env.VCAP_SERVICES) {
            vcap_services = JSON.parse(process.env.VCAP_SERVICES) ;
            mysql_creds["host"] = vcap_services["p.mysql"][0]["credentials"]["hostname"] ;
            mysql_creds["user"] = vcap_services["p.mysql"][0]["credentials"]["username"] ;
            mysql_creds["password"] = vcap_services["p.mysql"][0]["credentials"]["password"] ;
            mysql_creds["port"] = vcap_services["p.mysql"][0]["credentials"]["port"] ;
            mysql_creds["database"] = vcap_services["p.mysql"][0]["credentials"]["name"] ;
            if (vcap_services["p.mysql"][0]["credentials"]["tls"]) {
                //This utilizes the CA in VCAP_SERVICES - and implementing applications will need rebinding and restaging
                mysql_creds["ca_certificate"] = vcap_services["p.mysql"][0]["credentials"]["tls"]["cert"]["ca"];

                //This would utilize the list of trusted certificates in the trust store - implementing applications will not need rebinding or restaging.
                mysql_creds["ca_certificate"] = fs.readFileSync("/etc/ssl/certs/ca-certificates.crt");

            } else {
                mysql_creds["ca_certificate"] = undefined ;
            }
        }

        MySQLConnect();

        function MySQLConnect() {
            clientConfig = {
                host : mysql_creds["host"],
                user : mysql_creds["user"],
                password : mysql_creds["password"],
                port : mysql_creds["port"],
                database : mysql_creds["database"]
            } ;
            if (mysql_creds["ca_certificate"]) {
                clientConfig["ssl"] = { ca : mysql_creds["ca_certificate"] } ;
            }
            dbClient = mysql.createConnection( clientConfig ) ;
            dbClient.connect(startDataInput) ;
        }

        function startDataInput(){
            console.log("Connected!");
            var sql = "create table if not exists testtable4 (_id int NOT NULL AUTO_INCREMENT primary key, _word varchar(255));";
            dbClient.query(sql, function (err, result) {
                if (err) throw err;
            });
            interval = setInterval(sendMessages, 5000);
        }
        function sendMessages(){
            var sql2 = "insert into testtable4 (_word) values ('josh');";
            dbClient.query(sql2, function (err, result) {
                if (err) throw err;
                console.log("Connection active - message sent at " + Date.now());
            });
        }
    },
};

