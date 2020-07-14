요건은 특정 폴더에 class 들이 있다. 이 class 들을 동적으로 로딩하여

특정 메소드를 실행하고 결과 중 유효값이 제일 좋은 거를 사용해라.. 머 이런거 였던걸로 기억합니다.

 

첨부파일은 eclipse project이고 sp.loading.DynamicLoading.java 보시면 됩니다.

 

간략하게 흐름을 말씀 드리면

 

1. classs 들이 들어 있는 폴더를 URLClassLoader로 가져옵니다.

   (단, package를 고려하여 Root 폴더를 지정해야 합니다.)

 

2. classs 들이 들어 있는 폴더에 .class 파일들의 목록을 가져옵니다.

 

3. URLClasseLoader를 이용해서 instance 화 하고, 해당되는 method를 가져옵니다.

 

4. method를 주어진 파라메터와 함께 invoke 합니다.
