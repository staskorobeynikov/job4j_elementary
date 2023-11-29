package ru.job4j.hash;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        Map<Integer, List<Task>> buffer = new LinkedHashMap<>();
        for (Task task : tasks) {
            List<Task> taskList = buffer.getOrDefault(task.assignId, new ArrayList<>());
            taskList.add(task);
            buffer.put(task.assignId(), taskList);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Task>> entry : buffer.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
