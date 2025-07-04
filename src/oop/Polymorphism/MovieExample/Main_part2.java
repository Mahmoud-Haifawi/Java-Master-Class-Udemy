package oop.Polymorphism.MovieExample;

public class Main_part2
{
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

// Type inferred as Movie (return type of getMovie)
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie(); // Works
       // airplane.watchComedy(); // COMPILATION ERROR - still inferred as Movie
        //
// Type inferred as Comedy (constructor type)
        var plane = new Comedy("Airplane");
        plane.watchComedy(); // Works - compiler knows it's Comedy



        /*

            Compile-Time Type (Reference Type):

            - Declared type of variable/parameter/return type
            - Determines which methods can be called
            - Known at compilation
            - Left side of assignment operator

            Runtime Type (Actual Object Type):

            - Actual class of object in memory
            - Determines which method implementation executes
            - Only known during execution
            - Right side of assignment operator
        * */
        Movie movie2 = Movie.getMovie("A", "Jaws"); // Movie = compile-time, Adventure = runtime
        movie2.watchMovie(); // Calls Adventure.watchMovie() due to runtime type

    }



}
