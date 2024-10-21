# java-calculator-precourse
<br>

## 🛩️ 미션 간단 설명
해당 미션은 문자열 덧셈 계산기를 구현하는 과제이다.  
입력된 문자열에서 숫자를 추출하고, 구분자를 기준으로 각 숫자의 합을 계산하는 프로그램이다.  
쉼표(,)와 콜론(:)을 기본 구분자로 사용하며, 커스텀 구분자를 설정할 수 있다.  
잘못된 입력이 들어올 경우 예외 처리를 해야 한다.
<br><br>

## 🔐 제약 사항
- 제공된 camp.nextstep.edu.missionutils.Console 라이브러리의 readLine() 메서드를 사용하여 사용자 입력을 처리해야 한다.
- 커스텀 구분자는 "//" 와 "\n" 사이에 위치한 문자를 사용한다.
- 잘못된 값 입력 시 IllegalArgumentException 을 발생시키고 프로그램을 종료해야 한다.
- 프로그램 종료 시 System.exit()는 호출하지 않는다.
  <br><br>

  ## 🛠️ 기능 구현 목록
- [ ] 📌 <b>입력 값 유효성 검사 및 빈 문자열 처리</b> 
    - 입력이 비어있거나 null일 경우 0을 반환하도록 유효성 검사를 수행한다.
<br><br>
- [ ] 📌 <b>쉼표 및 콜론을 구분자로 숫자 추출 기능 구현</b> 
    - 쉼표(,) 또는 콜론(:)을 기준으로 입력 문자열을 분리하여 숫자를 추출하는 기능을 구현한다.
      <br><br>
- [ ] 📌 <b>커스텀 구분자 처리 기능 구현</b> 
    - 입력값에 커스텀 구분자가 포함된 경우, 해당 구분자를 추출하여 이를 기준으로 숫자를 분리하는 기능을 구현한다.
      <br><br>
- [ ] 📌 <b>숫자 합산 기능 구현</b> 
    - 분리된 숫자 문자열을 정수로 변환하여 합산하는 기능을 구현한다.
      <br><br>
- [ ] 📌 <b>잘못된 입력 처리 기능 구현</b> 
    - 음수가 포함된 경우 IllegalArgumentException을 발생시켜 프로그램을 종료하는 기능을 구현한다.
      <br><br>
- [ ] 📌 <b>결과 출력 기능 구현</b> 
    - 계산된 결과 값을 출력하는 기능을 구현한다.
      <br><br>
- [ ] 📌 <b>테스트 케이스 작성</b> 
    - 각 기능별로 올바르게 동작하는지 테스트 케이스를 작성한다.