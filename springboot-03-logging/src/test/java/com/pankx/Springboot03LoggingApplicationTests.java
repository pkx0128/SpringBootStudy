package com.pankx;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Springboot03LoggingApplicationTests {
    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志级别：error>warn>info>debug>trace，SpringBoot默认级别为info
        //调整日志的输出级别以输出更多级别的日志信息，调整的级别为当前级别向大级别包涵
        logger.trace("trace日志，用于输出跟踪轨迹");
        logger.debug("debug日志，用于输出调试日志");
        logger.info("info日志，主要用于输出自定义的日志");
        logger.warn("warn日志，主要用于记录警告的日志");
        logger.error("error日志，主要用于记录错误日志");
    }

}
