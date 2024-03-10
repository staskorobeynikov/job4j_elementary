package ru.job4j.map;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class AnalyzeHttpLogTest {
    @Test
    public void whenGroupByLevel() {
        var logs = List.of(
                new AnalyzeHttpLog.Line("ERROR", "[threads [qbxb [bbb]] - 1]", "yaee ybz"),
                new AnalyzeHttpLog.Line("ERROR", "[threads [xcde [aqx]] - 0]", "wyce"),
                new AnalyzeHttpLog.Line("ERROR", "[threads [wcxf [czed [ayya [fye]]]] - 0]", "eaba yzd"),
                new AnalyzeHttpLog.Line("DEBUG", "[threads [zqfz [wbye [zfq]]] - 1]", "[cz] bxa")
        );
        assertThat(AnalyzeHttpLog.groupByLevel(logs)).isEqualTo(Map.of("ERROR", 3L, "DEBUG", 1L));
    }
}