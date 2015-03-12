package week7Singleton;

public class DBConnection {
private static DBConnection db = new DBConnection();
private DBConnection()
{
System.out.println("Connected to DB");
}
public static DBConnection getConnection()
{
if(db == null)
{
db = new DBConnection();
return db;
}
else
return db;
}
}
