package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.BaseModelQueriable;
import com.raizlabs.android.dbflow.sql.language.Condition;
import com.raizlabs.android.dbflow.sql.language.ITypeConditional;
import com.raizlabs.android.dbflow.sql.language.NameAlias;
import com.raizlabs.android.dbflow.structure.Model;

import static com.raizlabs.android.dbflow.sql.language.Condition.column;

/**
 * Description: Basic {@link long} property. Accepts only long, {@link BaseModelQueriable}, and
 * {@link ITypeConditional} objects.
 */
public class LongProperty extends BaseProperty<LongProperty> {

    public LongProperty(Class<? extends Model> table, NameAlias nameAlias) {
        super(table, nameAlias);
    }

    public LongProperty(Class<? extends Model> table, String columnName) {
        this(table, new NameAlias(columnName));
    }

    public LongProperty(Class<? extends Model> table, String columnName, String aliasName) {
        this(table, new NameAlias(columnName, aliasName));
    }

    @Override
    public LongProperty plus(IProperty iProperty) {
        return new LongProperty(table, NameAlias.joinNames(Condition.Operation.PLUS,
                nameAlias.getName(), iProperty.toString()));
    }

    @Override
    public LongProperty minus(IProperty iProperty) {
        return new LongProperty(table, NameAlias.joinNames(Condition.Operation.MINUS,
                nameAlias.getName(), iProperty.toString()));
    }

    @Override
    public LongProperty as(String aliasName) {
        return new LongProperty(table, nameAlias.getAliasNameRaw(), aliasName);
    }

    @Override
    public LongProperty distinct() {
        return new LongProperty(table, getDistinctAliasName());
    }

    @Override
    public LongProperty withTable(NameAlias tableNameAlias) {
        return new LongProperty(table, new NameAlias(nameAlias).withTable(tableNameAlias.getAliasName()));
    }

    public Condition is(long value) {
        return column(nameAlias).is(value);
    }

    public Condition eq(long value) {
        return column(nameAlias).eq(value);
    }

    public Condition isNot(long value) {
        return column(nameAlias).isNot(value);
    }

    public Condition notEq(long value) {
        return column(nameAlias).notEq(value);
    }

    public Condition like(long value) {
        return column(nameAlias).like(value);
    }

    public Condition glob(long value) {
        return column(nameAlias).glob(value);
    }

    public Condition greaterThan(long value) {
        return column(nameAlias).greaterThan(value);
    }

    public Condition greaterThanOrEq(long value) {
        return column(nameAlias).greaterThanOrEq(value);
    }

    public Condition lessThan(long value) {
        return column(nameAlias).lessThan(value);
    }

    public Condition lessThanOrEq(long value) {
        return column(nameAlias).lessThanOrEq(value);
    }

    public Condition.Between between(long value) {
        return column(nameAlias).between(value);
    }

    public Condition.In in(long firstValue, long... values) {
        Condition.In in = column(nameAlias).in(firstValue);
        for (long value : values) {
            in.and(value);
        }
        return in;
    }

    public Condition.In notIn(long firstValue, long... values) {
        Condition.In in = column(nameAlias).notIn(firstValue);
        for (long value : values) {
            in.and(value);
        }
        return in;
    }

    public Condition concatenate(long value) {
        return column(nameAlias).concatenate(value);
    }

    public Condition is(LongProperty property) {
        return column(nameAlias).is(property);
    }

    public Condition isNot(LongProperty property) {
        return column(nameAlias).isNot(property);
    }

    public Condition eq(LongProperty property) {
        return is(property);
    }

    public Condition notEq(LongProperty property) {
        return isNot(property);
    }

    public Condition greaterThan(LongProperty property) {
        return column(nameAlias).greaterThan(property);
    }

    public Condition greaterThanOrEq(LongProperty property) {
        return column(nameAlias).greaterThanOrEq(property);
    }

    public Condition lessThan(LongProperty property) {
        return column(nameAlias).lessThan(property);
    }

    public Condition lessThanOrEq(LongProperty property) {
        return column(nameAlias).lessThanOrEq(property);
    }

}
