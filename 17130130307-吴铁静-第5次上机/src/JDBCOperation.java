package fourthshangji;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCOperation {
	static class Student {
        private String Id;
        private String Name;
        private String Sex;
        private String Age;

        Student(String Id,String Name, String Sex, String Age) {
            this.Id = Id; //default
            this.Name = Name;
            this.Sex = Sex;
            this.Age = Age;
        }

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getSex() {
            return Sex;
        }

        public void setSex(String Sex) {
            this.Sex = Sex;
        }

        public String getAge() {
            return Age;
        }

        public void setage(String Age) {
            this.Age = Age;
        }        
}
	
	private static Connection getConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/javatest";
	    String username = "root";
	    String password = "";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	
	private static int insert(Student student) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "insert into student (Id,Name,Sex,Age) values(?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, student.getId());
	        pstmt.setString(2, student.getName());
	        pstmt.setString(3, student.getSex());
	        pstmt.setString(4, student.getAge());
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	private static int update(Student student) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "update student set Age='" + student.getAge() + "' where Name='" + student.getName() + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	private static Integer getAll() {
	    Connection conn = getConn();
	    String sql = "select * from student";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");
	        while (rs.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
	            System.out.println("============================");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	private static int delete(String name) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "delete from student where Name='" + name + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}	



public static void main(String args[]) {
    JDBCOperation.getAll();
    JDBCOperation.insert(new Student("17130130000","zhoujielun", "male", "20"));
    JDBCOperation.getAll();
    JDBCOperation.update(new Student("","wutiejing", "", "20"));
    JDBCOperation.delete("zhoujielun");
    JDBCOperation.getAll();
}}
