//package com.bass;
//
//import org.hibernate.criterion.SimpleExpression;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ExampleMatcher;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by ytx on 17/5/18.
// * lc
// * 查询工具类
// */
//public class QueryTools {
//    /**
//     * 默认静态查询最大查询条数
//     */
//    public static final int countMax = 500;
//    /**
//     * Null 为空
//     */
//    public static final String NULL = "isNull";
//    /**
//     * NotNull 不为空
//     */
//    public static final String NOTNULL = "isNotNull";
//    /**
//     * equal 等于
//     */
//    public static final String EQUAL = "equal";
//    /**
//     * notEqual 不等于
//     */
//    public static final String NOTEQUAL = "notEqual";
//    /**
//     * or 或者
//     */
////    public static final String OR = "or";
//    /**
//     * isTrue 是true
//     */
//    public static final String ISTRUE = "isTrue";
//    /**
//     * isFalse 是false
//     */
//    public static final String ISFALSE = "isFalse";
//    /**
//     * gt 大于
//     */
//    public static final String GT = "gt";
//    /**
//     * ge 大于等于
//     */
//    public static final String GE = "ge";
//    /**
//     * lt 小于
//     */
//    public static final String LT = "lt";
//    /**
//     * le 小于等于
//     */
//    public static final String LE = "le";
//    /**
//     * like 模糊查询
//     */
//    public static final String LIKE = "like";
//    /**
//     * notLike 模糊查询
//     */
//    public static final String NOTLIKE = "notLike";
//    /**
//     * in in函数
//     */
//    public static final String IN = "in";
//    /**
//     * gtData 数据库字段时间 >= 条件时间
//     */
//    public static final String GEDATE = "gtData";
//    /**
//     * leData 数据库字段时间 <= 条件时间
//     */
//    public static final String LEDATE = "leData";
//    /**
//     * gtData 数据库字段时间 > 条件时间
//     */
//    public static final String GTDATE = "gtData";
//    /**
//     * ltData 数据库字段时间 < 条件时间
//     */
//    public static final String LTDATE = "ltData";
//
//
//    /**
//     * 直接由 Restrictions 对象构建List<Predicate> list
//     *
//     * @param list
//     * @return 对象
//     * @throws Exception
//     */
//    public static Predicate[] conditions(List<SimpleExpression> list) {
//        Predicate[] p = new Predicate[list.size()];
//        return list.toArray(p);
//    }
//
//    /**
//     * 对象条件查询
//     * @param conditions 查询条件 只做等于匹配
//     * @return 返回Example
//     * @throws Exception 异常抛出
//     */
//    public  static  Example  getExample(Conditions conditions) {
//        Object obj=conditions.getT();
//        Class cls=obj.getClass();
//        //创建匹配器，即如何使用查询条件
//        try {
//            List<ConditionsDto> conditionsDtos = conditions.getConditionsDtos();
//            for (ConditionsDto condition : conditionsDtos) {
//                Field field= cls.getDeclaredField(condition.getField());
//                field.setAccessible(true);
//                field.set(obj, condition.getVal());
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return Example.of(obj, ExampleMatcher.matching());
//    }
//
//    /**
//     * 多条件参数分页查询，通过反射自动构建查询条件
//     *
//     * @param conditions      查询条件
//     * @param root            root参数
//     * @param criteriaQuery   query参数
//     * @param criteriaBuilder builder参数
//     * @return 返回查询条件数组
//     */
//    public static Predicate[] conditions(Conditions conditions, Root<?> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//        List<Predicate> list = new ArrayList<Predicate>();
//        try {
//            Class las = conditions.getT().getClass();
//            List<ConditionsDto> conditionsDtos = conditions.getConditionsDtos();
//            for (ConditionsDto condition : conditionsDtos) {
//                matchin(list, root, criteriaBuilder, condition, las.getDeclaredField(condition.getField()));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Predicate[] p = new Predicate[list.size()];
//        return list.toArray(p);
//    }
//
//    /**
//     * 分页查询条件匹配
//     * @param list 匹配结果
//     * @param root root参数
//     * @param criteriaBuilder builder参数
//     * @param condition 查询条件
//     * @param field 字段
//     */
//    static void matchin(List<Predicate> list, Root<?> root, CriteriaBuilder criteriaBuilder, ConditionsDto condition, Field field) {
//        if (NULL.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.isNull(root.get(condition.getField()).as(field.getType())));
//        } else if (NOTNULL.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.isNotNull(root.get(condition.getField()).as(field.getType())));
//        } else if (EQUAL.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.equal(root.get(condition.getField()).as(field.getType()), condition.getVal()));
//        } else if (NOTEQUAL.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.notEqual(root.get(condition.getField()).as(field.getType()), condition.getVal()));
//        } else if (ISTRUE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.isTrue(root.get(condition.getField())));
//        } else if (ISFALSE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.isFalse(root.get(condition.getField())));
//        } else if (GT.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.gt(root.get(condition.getField()), (Number) condition.getVal()));
//        } else if (GE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.ge(root.get(condition.getField()), (Number) condition.getVal()));
//        } else if (LT.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.lt(root.get(condition.getField()), (Number) condition.getVal()));
//        } else if (LE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.le(root.get(condition.getField()), (Number) condition.getVal()));
//        } else if (LIKE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.like(root.get(condition.getField()), String.valueOf(condition.getVal())));
//        } else if (NOTLIKE.equals(condition.getConditions())) {
//            list.add(criteriaBuilder.notLike(root.get(condition.getField()), String.valueOf(condition.getVal())));
//        } else if (IN.equals(condition.getConditions())) {
//            CriteriaBuilder.In<Object> in=criteriaBuilder.in(root.get(condition.getField()));
//            for (Object conditionColumnValue : (Object[])condition.getVal()) {
//                in.value(conditionColumnValue);
//            }
//            list.add(in);
//        }else if(GEDATE.equals(condition.getConditions())){
//            Predicate restrictions = criteriaBuilder.conjunction();
//            list.add(criteriaBuilder.and(restrictions, criteriaBuilder.greaterThanOrEqualTo(root.<Date>get(condition.getField()),(Date) condition.getVal())));
//        }else if(LEDATE.equals(condition.getConditions())){
//            Predicate restrictions = criteriaBuilder.conjunction();
//            list.add(criteriaBuilder.and(restrictions, criteriaBuilder.lessThanOrEqualTo(root.<Date>get(condition.getField()),(Date) condition.getVal())));
//        }else if(GTDATE.equals(condition.getConditions())){
//            Predicate restrictions = criteriaBuilder.conjunction();
//            list.add(criteriaBuilder.and(restrictions, criteriaBuilder.greaterThan(root.<Date>get(condition.getField()),(Date) condition.getVal())));
//        }else if(LTDATE.equals(condition.getConditions())){
//            Predicate restrictions = criteriaBuilder.conjunction();
//            list.add(criteriaBuilder.and(restrictions, criteriaBuilder.lessThan(root.<Date>get(condition.getField()),(Date) condition.getVal())));
//        }else {
//            list.add(criteriaBuilder.equal(root.get(condition.getField()).as(field.getType()), condition.getVal()));
//        }
//    }
//}
