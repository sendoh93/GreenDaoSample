package com.ypf.greendao.db.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.ArrayMap;

import java.util.Map;
import java.util.Set;

/**
 * sql语句建造器
 * Created by pingfan.yang on 2016/10/27.
 */
public final class SQLSelectBuilder {
    private StringBuffer mBuffer;

    private SQLSelectBuilder() {
        mBuffer = new StringBuffer();
    }

    public static SQLSelectBuilder newInstance() {
        return new SQLSelectBuilder();
    }

    /**
     * select查询语句
     *
     * @param columns  需要查询的字段
     * @param distinct 是否去重复
     */
    public SQLSelectBuilder select(boolean distinct, String... columns) {
        mBuffer.append("SELECT ");
        if (distinct) mBuffer.append("DISTINCT ");
        int length = columns.length;
        for (int i = 0; i < length; i++) {
            mBuffer.append(columns[i]);
            if (i < length - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(" ");
        }
        return this;
    }

    /**
     * select查询语句,使用AS关键字映射表字段
     *
     * @param columns  需要查询的字段
     * @param distinct 是否去重复
     */
    public SQLSelectBuilder select(Map<String, String> columns, boolean distinct) {
        mBuffer.append("SELECT ");
        if (distinct) mBuffer.append("DISTINCT ");
        Set<Map.Entry<String, String>> entries = columns.entrySet();
        int length = entries.size();
        int i = 0;
        for (Map.Entry<String, String> entry : entries) {
            mBuffer.append(entry.getKey()).append(" AS ").append(entry.getValue());
            if (i < length - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(" ");
            i++;
        }
        return this;
    }

    /**
     * FROM关键字
     *
     * @param table 表名
     * @param alias 表别名
     */
    public SQLSelectBuilder from(String table, String alias) {
        mBuffer.append("FROM ")
                .append(table)
                .append(" ")
                .append(alias)
                .append(" ");
        return this;
    }

    /**
     * 左连接
     *
     * @param table         从动表名
     * @param alias         表别名
     * @param joinCondition 连接条件
     */
    public SQLSelectBuilder leftJoin(String table, String alias, String joinCondition) {
        mBuffer.append("LEFT JOIN ")
                .append(table)
                .append(" ")
                .append(alias)
                .append(" ON ")
                .append(joinCondition)
                .append(" ");
        return this;
    }

    /**
     * 右连接
     *
     * @param table         驱动表名
     * @param alias         表别名
     * @param joinCondition 连接条件
     */
    public SQLSelectBuilder rightJoin(String table, String alias, String joinCondition) {
        mBuffer.append("RIGHT JOIN ")
                .append(table)
                .append(" ")
                .append(alias)
                .append(" ON ")
                .append(joinCondition)
                .append(" ");
        return this;
    }

    /**
     * 內连接
     *
     * @param table         表名
     * @param alias         表别名
     * @param joinCondition 连接条件
     */
    public SQLSelectBuilder innerJoin(String table, String alias, String joinCondition) {
        mBuffer.append("INNER JOIN ")
                .append(table)
                .append(" ")
                .append(alias)
                .append(" ON ")
                .append(joinCondition)
                .append(" ");
        return this;
    }

    /**
     * WHERE条件
     *
     * @param conditionColumn 条件字段
     * @param tableAlias      表别名
     */
    public SQLSelectBuilder where(String conditionColumn, String tableAlias) {
        mBuffer.append("WHERE ").append(tableAlias).append(".").append(conditionColumn + " ");
        return this;
    }

    /**
     * AND条件
     *
     * @param conditionColumn 条件字段
     * @param tableAlias      表别名
     */
    public SQLSelectBuilder and(String conditionColumn, String tableAlias) {
        mBuffer.append(" AND ").append(tableAlias).append(".").append(conditionColumn);
        return this;
    }

    /**
     * OR条件
     *
     * @param conditionColumn 条件字段
     * @param tableAlias      表别名
     */
    public SQLSelectBuilder or(String conditionColumn, String tableAlias) {
        mBuffer.append("OR ").append(tableAlias).append(".").append(conditionColumn);
        return this;
    }

    /**
     * 等于条件符
     */
    public SQLSelectBuilder eq() {
        mBuffer.append(" = ? ");
        return this;
    }

    /**
     * 不等于条件符
     */
    public SQLSelectBuilder neq(String selectionArgs) {
        mBuffer.append(" <> " + selectionArgs);
        return this;
    }

    /**
     * 等于条件符
     *
     * @param selectionArgs
     * @param isSql
     */
    public SQLSelectBuilder eq(String selectionArgs, boolean isSql) {
        mBuffer.append(" = ");
        if (!isSql) mBuffer.append(selectionArgs);
        else mBuffer.append("(").append(selectionArgs).append(") ");
        return this;
    }

    /**
     * 大于条件符
     */
    public SQLSelectBuilder gt() {
        mBuffer.append(" > ? ");
        return this;
    }

    /**
     * 大于条件符
     *
     * @param sql 条件sql
     */
    public SQLSelectBuilder gt(String sql) {
        mBuffer.append(" > (").append(sql).append(") ");
        return this;
    }

    /**
     * 小于条件符
     */
    public SQLSelectBuilder lt() {
        mBuffer.append(" < ? ");
        return this;
    }

    /**
     * 小于条件符
     *
     * @param sql 条件sql
     */
    public SQLSelectBuilder lt(String sql) {
        mBuffer.append(" < (").append(sql).append(") ");
        return this;
    }

    /**
     * LIKE条件符
     */
    public SQLSelectBuilder like() {
        mBuffer.append(" LIKE ? ");
        return this;
    }

    /**
     * LIKE条件符
     *
     * @param selectionArgs 查询关键字
     */
    public SQLSelectBuilder like(String selectionArgs) {
        mBuffer.append(" LIKE '" + selectionArgs + "' ");
        return this;
    }

    /**
     * between条件符
     */
    public SQLSelectBuilder between() {
        mBuffer.append(" BETWEEN ? AND ? ");
        return this;
    }

    /**
     * IN条件符
     *
     * @param conditionCount 条件数量
     */
    public SQLSelectBuilder in(int conditionCount) {
        mBuffer.append(" IN (");
        for (int i = 0; i < conditionCount; i++) {
            mBuffer.append("?");
            if (i < conditionCount - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(") ");
        }
        return this;
    }

    /**
     * IN条件符
     *
     * @param sqls 条件SQL
     */
    public SQLSelectBuilder in(String... sqls) {
        mBuffer.append(" IN (");
        int length = sqls.length;
        for (int i = 0; i < length; i++) {
            mBuffer.append(sqls[i]);
            if (i < length - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(") ");
        }
        return this;
    }

    /**
     * NOT IN条件符
     *
     * @param conditionCount 条件数量
     */
    public SQLSelectBuilder notIn(int conditionCount) {
        mBuffer.append(" NOT IN (");
        for (int i = 0; i < conditionCount; i++) {
            mBuffer.append("?");
            if (i < conditionCount - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(") ");
        }
        return this;
    }

    /**
     * NOT IN条件符
     *
     * @param sqls 条件SQL
     */
    public SQLSelectBuilder notIn(String... sqls) {
        mBuffer.append(" NOT IN (");
        int length = sqls.length;
        for (int i = 0; i < length; i++) {
            mBuffer.append(sqls[i]);
            if (i < length - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(") ");
        }
        return this;
    }

    /**
     * 排序关键字
     */
    public SQLSelectBuilder orderBy() {
        mBuffer.append(" ORDER BY");
        return this;
    }

    /**
     * 升序
     *
     * @param condition 条件字段
     */
    public SQLSelectBuilder asc(String condition) {
        mBuffer.append(" ").append(condition).append(" ASC,");
        return this;
    }

    /**
     * 降序
     *
     * @param condition 条件字段
     */
    public SQLSelectBuilder desc(String condition) {
        mBuffer.append(" ").append(condition).append(" DESC,");
        return this;
    }

    /**
     * 分组条件
     *
     * @param conditions 条件字段集合
     */
    public SQLSelectBuilder groupBy(String... conditions) {
        mBuffer.append("GROUP BY ");
        int length = conditions.length;
        for (int i = 0; i < length; i++) {
            mBuffer.append(conditions[i]);
            if (i < length - 1)
                mBuffer.append(", ");
            else
                mBuffer.append(" ");
        }
        return this;
    }

    /**
     * sql语句建造完成
     */
    public String build() {
        if (mBuffer.toString().endsWith(","))
            return mBuffer.substring(0, mBuffer.length() - 1).toString();
        else
            return mBuffer.toString();
    }

    /**
     * 字段别名设置
     * Created by chenkai.gu on 2016/10/27.
     */
    public static final class Alias {
        private Map<String, String> aliases;

        @TargetApi(Build.VERSION_CODES.KITKAT)
        private Alias() {
            aliases = new ArrayMap<>();
        }

        public static Alias newInstance() {
            return new Alias();
        }

        /**
         * 设置字段别名
         *
         * @param column   字段原名
         * @param columnAs 字段别名
         */
        public Alias as(String column, String columnAs) {
            aliases.put(column, columnAs);
            return this;
        }

        public Map<String, String> build() {
            return aliases;
        }
    }
}
