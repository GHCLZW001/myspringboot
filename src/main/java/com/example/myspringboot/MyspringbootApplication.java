package com.example.myspringboot;



import jdk.internal.org.objectweb.asm.Handle;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
@PropertySource("classpath:application.yml")


public class MyspringbootApplication {
    public static void main(String[] args) {
//        LocalDate now =LocalDate.of(2024,7,17);
//        System.out.println(now.minusDays(16));
//        System.out.println(now.minusDays(15));
//        System.out.println(now.minusDays(17).compareTo(now.minusDays(16)));
//
//        String[] arr1 = {"a","b","c"};
//        List<String> listA = new ArrayList<>(Arrays.asList(arr1));
//
//        String[] arr2 = {"a","b","c","d"};
//        List<String> listB = new ArrayList<>(Arrays.asList(arr2));
//
//        List<String> resultlist = Stream.of(listA, listB)
//                .flatMap(Collection::stream)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(resultlist);
//
//        System.out.println(BigDecimal.valueOf(15).compareTo(BigDecimal.valueOf(15)));

//        如果Map为空不会进循环
//        List<Long> creatoverthreemonth = new ArrayList<>();
//        Map<Long, LocalDateTime> cancleCardApplyMap = new HashMap<>();
//        Map<Long, LocalDateTime> chageCardApplyMap = new HashMap<>();
//        for (Long accountId : cancleCardApplyMap.keySet()) {
//            System.out.println("进入for循环");
//            if(Objects.nonNull(chageCardApplyMap.get(accountId))){
//                if (chageCardApplyMap.get(accountId).toLocalDate().compareTo(cancleCardApplyMap.get(accountId).toLocalDate())>0){
//                    cancleCardApplyMap.remove(accountId);
//                    cancleCardApplyMap.put(accountId,chageCardApplyMap.get(accountId));
//                    chageCardApplyMap.remove(accountId);
//                }else {
//                    chageCardApplyMap.remove(accountId);
//                }
//            }
//        }
//        System.out.println("++++++++"+cancleCardApplyMap);
//        System.out.println("++++++++"+chageCardApplyMap);
//        cancleCardApplyMap.putAll(chageCardApplyMap);
//        System.out.println("--------"+cancleCardApplyMap);
//        for (Map.Entry<Long, LocalDateTime> longLocalDateTimeEntry : cancleCardApplyMap.entrySet()) {
//            if (longLocalDateTimeEntry.getValue().toLocalDate().compareTo(LocalDate.now().minusMonths(3))<0){
//                creatoverthreemonth.add(longLocalDateTimeEntry.getKey());
//            }
//        }
//        System.out.println("zuihou"+creatoverthreemonth);
//      互获取当前月的第一天的LocalDateTime
        System.out.println(YearMonth.now().atDay(1).atStartOfDay());
        System.out.println("=====================================");
        // 获取当前日期
        LocalDate now = LocalDate.now();
        // 获取当前月份的第一天
        LocalDate firstDayOfMonth = now.withDayOfMonth(1);
        // 将 LocalDate 转换为 LocalDateTime 并设置时间为00:00:00
        LocalDateTime startOfMonth = firstDayOfMonth.atStartOfDay();
        // 打印结果
        System.out.println("当前月的开始时间： " + startOfMonth);
    }
}
