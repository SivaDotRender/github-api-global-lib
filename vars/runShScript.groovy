def call(fileName){
  def test = getShellScript('test.sh')
  sh(test)
}
