public class Main extends Abstract{
void ontext(String text)
{
System.out.println(text);
}
public Main()
{
TextScanner ts=new TextScanner(this);
ts.scan();
}
public static void main(String[] args) {
Main m=new Main();
m.example();
}
 
}
