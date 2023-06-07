def call(fileName){
  String script = libraryResource "com/planetpope/scripts/linux/${fileName}"
  
  return script
}
