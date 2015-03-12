package week7Singleton;

public class TestDriver {

public static void main(String[] args)
{
int i = 0;
while(i < 2)
{
	DBConnection db = DBConnection.getConnection();
i++;
}
}
}
