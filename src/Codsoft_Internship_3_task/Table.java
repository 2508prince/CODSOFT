package Codsoft_Internship_3_task;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class Table { DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
    ResultSetMetaData metaData = rs.getMetaData();

    // Get column names
    int columnCount = metaData.getColumnCount();
    Vector<String> columnNames = new Vector<String>();
    for (int i = 1; i <= columnCount; i++) {
        columnNames.add(metaData.getColumnName(i));
    }

    // Get row data
    Vector<Vector<Object>> rowData = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> row = new Vector<Object>();
        for (int i = 1; i <= columnCount; i++) {
            row.add(rs.getObject(i));
        }
        rowData.add(row);
    }

    return new DefaultTableModel(rowData, columnNames);
}
}
