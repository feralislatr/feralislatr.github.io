node {
  for (int i=0; i< 3; ++i) {  
    stage "Stage #"+i.toString()
    print 'Hello, world $i!'
  }
}
