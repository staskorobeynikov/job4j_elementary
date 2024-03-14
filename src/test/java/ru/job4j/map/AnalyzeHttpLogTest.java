package ru.job4j.map;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
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

    @Test
    public void whenMaxByThread() {
        var logs = List.of(
                new AnalyzeHttpLog.Line("ERROR", "[threads [qbxb [bbb]] - 1]", "yaee ybze"),
                new AnalyzeHttpLog.Line("ERROR", "[threads [xcde [aqx]] - 0]", "wyce"),
                new AnalyzeHttpLog.Line("ERROR", "[threads [wcxf [czed [ayya [fye]]]] - 0]", "eaba yzd"),
                new AnalyzeHttpLog.Line("DEBUG", "[threads [zqfz [wbye [zfq]]] - 1]", "[cz] bxa")
        );
        assertThat(AnalyzeHttpLog.maxByThread(logs)).isEqualTo("[threads [qbxb [bbb]] - 1]");
    }

    @Test
    public void whenDetailByThread() {
        var logs = List.of(
                new AnalyzeHttpLog.Line("ERROR","[threads [qbxb]]", "yaee ybze"),
                new AnalyzeHttpLog.Line("ERROR","[threads [qbxb]]", "wyce"),
                new AnalyzeHttpLog.Line("ERROR", "[threads [qbxb]]", "eaba yzd"),
                new AnalyzeHttpLog.Line("DEBUG", "[threads [qbxb]]", "[cz] bxa")
        );
        assertThat(AnalyzeHttpLog.detailByThread(logs, "[threads [qbxb]]", List.of("ERROR", "DEBUG")))
                .isEqualTo(new LinkedHashMap<>(Map.of("ERROR", 3L, "DEBUG", 1L)));
    }
}