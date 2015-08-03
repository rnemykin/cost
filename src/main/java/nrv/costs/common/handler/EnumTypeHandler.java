package nrv.costs.common.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@MappedTypes(Enum.class)
public class EnumTypeHandler<T extends Enum> implements TypeHandler<T> {

    Class<T> classType;

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, T t, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, t.name());
    }

    @Override
    public T getResult(ResultSet resultSet, String s) throws SQLException {
        return fromValue(resultSet.getString(s));
    }


    @Override
    public T getResult(ResultSet resultSet, int i) throws SQLException {
        return fromValue(resultSet.getString(i));
    }

    @Override
    public T getResult(CallableStatement callableStatement, int i) throws SQLException {
        return fromValue(callableStatement.getString(i));
    }

    private T fromValue(String value) {
        if(value == null) {
            return null;
        }

        for (T item : classType.getEnumConstants()) {
            if( item.name().equalsIgnoreCase(value) ) {
                return item;
            }

        }


        throw new IllegalArgumentException("Unknown " + value + " for class " + classType);
    }
}
