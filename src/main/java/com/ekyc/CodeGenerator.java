package com.ekyc;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;
import java.util.Collections;

/**
 * @author yangkai
 * @create 2025/2/2114:45
 */
public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://database-1.cz6iq2080iav.ap-southeast-1.rds.amazonaws.com:3306/ekyc",
                                 "admin", "NMqMQEqHKisNKcJLAdao")
                .globalConfig(builder -> builder
                        .author("yangkai")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                        .disableOpenDir()
                )
                .packageConfig(builder -> builder
                        .parent("com.ekyc")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .pathInfo(Collections.singletonMap(
                                OutputFile.xml,
                                Paths.get(System.getProperty("user.dir"))
                                        .resolve("src/main/resources/mapper").toString()
                        ))
                )
                .strategyConfig(builder -> builder
                        .addInclude("test")
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
