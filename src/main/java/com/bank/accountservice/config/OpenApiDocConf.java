package com.bank.accountservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(name = "Sadvik Gowda", email = "sadu@gmail.com", url = "xyz.gmail.com"),
                description = "Documentation for account service",
                title = "Account service Doc",
                version = "1.0"
        ),
        servers = {
                @Server(description = "LOCAL ENV", url = "http://localhost:8091/account"),
                @Server(description = "TEST ENV", url = "testenv:8091/acct"),
                @Server(description = "TEST ENV", url = "devenv:8091/acct")
        }
)
public class OpenApiDocConf {
}
