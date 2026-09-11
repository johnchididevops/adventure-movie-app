{
  "package": "com.adventure.movie.repository",
  "imports": [
    "com.adventure.movie.model.Movie",
    "org.springframework.data.mongodb.repository.MongoRepository",
    "java.util.List"
  ],
  "interface": {
    "name": "MovieRepository",
    "extends": "MongoRepository<Movie, String>",
    "methods": [
      {
        "name": "findByGenre",
        "returnType": "List<Movie>",
        "parameters": [
          {
            "name": "genre",
            "type": "String"
          }
        ]
      }
    ]
  }
}