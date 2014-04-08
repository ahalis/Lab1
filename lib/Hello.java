public class Hello {
  public static main void( String argv[] ) {
    // Default is "World" 
    // Author: Ahmad Halis ( ahalis@ucsd.edu )
    String name = "World";
    if(argv.length !=0)
    {
      name = argv[0];
    }
    System.out.println( "Hello, " + name + "!" );
  }
}
