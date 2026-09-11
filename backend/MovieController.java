{
  "package": "com.adventure.movie.controller",
  "imports": [
    "com.adventure.movie.model.Movie",
    "com.adventure.movie.repository.MovieRepository",
    "org.springframework.web.bind.annotation.*",
    "java.util.List"
  ],
  "class": {
    "name": "MovieController",
    "annotations": [
      "@RestController",
      "@RequestMapping(\"/api/movies\")",
      "@CrossOrigin(origins = \"*\")"
    ],
    "fields": [
      {
        "name": "repository",
        "type": "MovieRepository",
        "modifiers": ["private", "final"]
      }
    ],
    "constructors": [
      {
        "parameters": [
          {
            "name": "repository",
            "type": "MovieRepository"
          }
        ],
        "body": "this.repository = repository;"
      }
    ],
    "methods": [
      {
        "name": "getAllMovies",
        "returnType": "List<Movie>",
        "annotations": ["@GetMapping"],
        "parameters": [],
        "body": "return repository.findAll();"
      },
      {
        "name": "addMovie",
        "returnType": "Movie",
        "annotations": ["@PostMapping"],
        "parameters": [
          {
            "name": "movie",
            "type": "Movie",
            "annotations": ["@RequestBody"]
          }
        ],
        "body": "return repository.save(movie);"
      }
    ]
  }
}