package com.jgainey.services.carotate.rabbitapp;

public class VCAPSTEST {

    public static String getNONTLSVCAP(){
        return " {\n" +
                " \t\"p.rabbitmq\": [{\n" +
                " \t\t\"label\": \"p.rabbitmq\",\n" +
                " \t\t\"provider\": null,\n" +
                " \t\t\"plan\": \"single-node\",\n" +
                " \t\t\"name\": \"testser\",\n" +
                " \t\t\"tags\": [\n" +
                " \t\t\t\"rabbitmq\"\n" +
                " \t\t],\n" +
                " \t\t\"instance_name\": \"testser\",\n" +
                " \t\t\"binding_name\": null,\n" +
                " \t\t\"credentials\": {\n" +
                " \t\t\t\"dashboard_url\": \"https://rmq-e2402cd5-8481-4559-9270-0475c5db3303.joshbot.ninja\",\n" +
                " \t\t\t\"hostname\": \"q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh\",\n" +
                " \t\t\t\"hostnames\": [\n" +
                " \t\t\t\t\"q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh\"\n" +
                " \t\t\t],\n" +
                " \t\t\t\"http_api_uri\": \"https://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@rmq-e2402cd5-8481-4559-9270-0475c5db3303.joshbot.ninja/api/\",\n" +
                " \t\t\t\"http_api_uris\": [\n" +
                " \t\t\t\t\"https://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@rmq-e2402cd5-8481-4559-9270-0475c5db3303.joshbot.ninja/api/\"\n" +
                " \t\t\t],\n" +
                " \t\t\t\"password\": \"ClBhkFnh2ni_JB_ChiMSEYER\",\n" +
                " \t\t\t\"protocols\": {\n" +
                " \t\t\t\t\"amqp\": {\n" +
                " \t\t\t\t\t\"host\": \"q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh\",\n" +
                " \t\t\t\t\t\"hosts\": [\n" +
                " \t\t\t\t\t\t\"q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh\"\n" +
                " \t\t\t\t\t],\n" +
                " \t\t\t\t\t\"password\": \"ClBhkFnh2ni_JB_ChiMSEYER\",\n" +
                " \t\t\t\t\t\"port\": 5672,\n" +
                " \t\t\t\t\t\"ssl\": false,\n" +
                " \t\t\t\t\t\"uri\": \"amqp://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh/e2402cd5-8481-4559-9270-0475c5db3303\",\n" +
                " \t\t\t\t\t\"uris\": [\n" +
                " \t\t\t\t\t\t\"amqp://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh/e2402cd5-8481-4559-9270-0475c5db3303\"\n" +
                " \t\t\t\t\t],\n" +
                " \t\t\t\t\t\"username\": \"b33e6864-a9f3-4ea3-87d6-db078e2e8ccf\",\n" +
                " \t\t\t\t\t\"vhost\": \"e2402cd5-8481-4559-9270-0475c5db3303\"\n" +
                " \t\t\t\t}\n" +
                " \t\t\t},\n" +
                " \t\t\t\"ssl\": false,\n" +
                " \t\t\t\"uri\": \"amqp://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh/e2402cd5-8481-4559-9270-0475c5db3303\",\n" +
                " \t\t\t\"uris\": [\n" +
                " \t\t\t\t\"amqp://b33e6864-a9f3-4ea3-87d6-db078e2e8ccf:ClBhkFnh2ni_JB_ChiMSEYER@q-s0.rabbitmq-server.mainnetwork.service-instance-e2402cd5-8481-4559-9270-0475c5db3303.bosh/e2402cd5-8481-4559-9270-0475c5db3303\"\n" +
                " \t\t\t],\n" +
                " \t\t\t\"username\": \"b33e6864-a9f3-4ea3-87d6-db078e2e8ccf\",\n" +
                " \t\t\t\"vhost\": \"e2402cd5-8481-4559-9270-0475c5db3303\"\n" +
                " \t\t},\n" +
                " \t\t\"syslog_drain_url\": null,\n" +
                " \t\t\"volume_mounts\": []\n" +
                " \t}]\n" +
                " }";
    }

    public static String getTLSVCAP(){
        return "{\n" +
                "\t\"p.rabbitmq\": [{\n" +
                "\t\t\"label\": \"p.rabbitmq\",\n" +
                "\t\t\"provider\": null,\n" +
                "\t\t\"plan\": \"single-node\",\n" +
                "\t\t\"name\": \"testsertls\",\n" +
                "\t\t\"tags\": [\n" +
                "\t\t\t\"rabbitmq\"\n" +
                "\t\t],\n" +
                "\t\t\"instance_name\": \"testsertls\",\n" +
                "\t\t\"binding_name\": null,\n" +
                "\t\t\"credentials\": {\n" +
                "\t\t\t\"dashboard_url\": \"https://rmq-fa77e69b-c666-4ff5-bf52-5ea311a080ad.joshbot.ninja\",\n" +
                "\t\t\t\"hostname\": \"q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh\",\n" +
                "\t\t\t\"hostnames\": [\n" +
                "\t\t\t\t\"q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"http_api_uri\": \"https://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@rmq-fa77e69b-c666-4ff5-bf52-5ea311a080ad.joshbot.ninja/api/\",\n" +
                "\t\t\t\"http_api_uris\": [\n" +
                "\t\t\t\t\"https://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@rmq-fa77e69b-c666-4ff5-bf52-5ea311a080ad.joshbot.ninja/api/\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"password\": \"SyuAF8NOfQAy3AzhNYtT04aT\",\n" +
                "\t\t\t\"protocols\": {\n" +
                "\t\t\t\t\"amqp+ssl\": {\n" +
                "\t\t\t\t\t\"host\": \"q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh\",\n" +
                "\t\t\t\t\t\"hosts\": [\n" +
                "\t\t\t\t\t\t\"q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"password\": \"SyuAF8NOfQAy3AzhNYtT04aT\",\n" +
                "\t\t\t\t\t\"port\": 5671,\n" +
                "\t\t\t\t\t\"ssl\": true,\n" +
                "\t\t\t\t\t\"uri\": \"amqps://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh/fa77e69b-c666-4ff5-bf52-5ea311a080ad\",\n" +
                "\t\t\t\t\t\"uris\": [\n" +
                "\t\t\t\t\t\t\"amqps://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh/fa77e69b-c666-4ff5-bf52-5ea311a080ad\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"username\": \"c61207f7-d063-4ec7-a24e-9d16e8ca37f6\",\n" +
                "\t\t\t\t\t\"vhost\": \"fa77e69b-c666-4ff5-bf52-5ea311a080ad\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"ssl\": true,\n" +
                "\t\t\t\"uri\": \"amqps://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh/fa77e69b-c666-4ff5-bf52-5ea311a080ad\",\n" +
                "\t\t\t\"uris\": [\n" +
                "\t\t\t\t\"amqps://c61207f7-d063-4ec7-a24e-9d16e8ca37f6:SyuAF8NOfQAy3AzhNYtT04aT@q-s0.rabbitmq-server.mainnetwork.service-instance-fa77e69b-c666-4ff5-bf52-5ea311a080ad.bosh/fa77e69b-c666-4ff5-bf52-5ea311a080ad\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"username\": \"c61207f7-d063-4ec7-a24e-9d16e8ca37f6\",\n" +
                "\t\t\t\"vhost\": \"fa77e69b-c666-4ff5-bf52-5ea311a080ad\"\n" +
                "\t\t},\n" +
                "\t\t\"syslog_drain_url\": null,\n" +
                "\t\t\"volume_mounts\": []\n" +
                "\t}]\n" +
                "}";
    }
}
