def call(fileName){
  String script = libraryResource "com/doordash/scripts/${fileName}"
  
  return script
}
