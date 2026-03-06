package com.dyogodev.vendacelulares;


import com.dyogodev.vendacelulares.model.Celular;
import com.dyogodev.vendacelulares.repository.CelularRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendaCelularesApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendaCelularesApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CelularRepository repository) {
        return args -> {
            // Criando o primeiro celular
            Celular c1 = new Celular();
            c1.setModelo("iPhone 15");
            c1.setMarca("Apple");
            c1.setPreco(5500.0);

            // Criando o segundo celular
            Celular c2 = new Celular();
            c2.setModelo("Galaxy S24");
            c2.setMarca("Samsung");
            c2.setPreco(4800.0);

            // Salvando no banco de dados
            repository.save(c1);
            repository.save(c2);

            System.out.println("Dados iniciais carregados com sucesso!");
        };
    }
}