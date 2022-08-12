## 💡 도서 쇼핑몰

### 👉 프로젝트 목적 

### 📌 요구사항 정의서
+ https://aeolian-caravan-34d.notion.site/PRD-2a9f36e74af14984879fce314cb2edf3

### 👉 기능설명
+ JpaRepository 인터페이스 이용하여 CRUD 게시판 구현하기
+ SpringSecurity 로그인 API 인증구현하기 (ex 네이버, 구글)
+ 댓글 기능 구현하기

### 👉 제작기간 / 참여인원
+ 제작기간: 2022-08-09 ~ 진행
+ 참여인원: 개인 프로젝트

### 🛠 사용 기술(기술스택)
#### Back-End
+ Java 11
+ SpringBoot 2.7.1
+ SpringSecurity
+ QueryDSL
+ Gradle
+ H2 Database
+ MySQL
+ TDD

### 👉 DDD(도메인 주도 설계)
<img src="https://user-images.githubusercontent.com/58936137/183679108-33579fec-ff1c-428e-a42f-1b9df6e33c09.png" width="500px" height="400px">

### 👉 클래스 다이어그램

<img src="https://user-images.githubusercontent.com/58936137/183896119-20baa655-f7eb-4380-a921-c59ec8653f0a.png" width="500px" height="400px">

### 💡 핵심기능
<details>
<summary><b>연관 관계 다대일 매핑</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>메인 화면 검색엔진(ElasticSearch) 적용</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>Query DSL 적용</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>TDD (테스트 주도 개발)</b></summary>
<div markdown="2">

</div>
</details>


### 📌 트러블 이슈
<details>
<summary><b>layout css 화면 적용이 안됨</b></summary>
<div markdown="2">

- layout:decorate="~{layouts/layout1}"
- 원인:

### 💡 해결방법
+ 

</div>
</details>



<details>
<summary><b>500 Error Controller 오류 발생</b></summary>
<div markdown="2">

- Caused by: java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'restfulController' method  
- 원인: RestController과 MemberController @GetMapping(/login) url에 login 중복으로 오류 발생

### 💡 해결방법

<details>
<summary><b>기존 코드</b></summary>
<div markdown="2">

MemberController.class
~~~
    @GetMapping("/login")
    public String login(){

        return "member/memberLogin";
    }

~~~

</div>
</details>

<details>
<summary><b>개선 코드</b></summary>
<div markdown="2">

MemberController.class
~~~
    @GetMapping("/logins") // 수정 후 개선
    public String login(){

        return "member/memberLogin";
    }

~~~

</div>
</details>


</div>
</details>


<details>
<summary><b>Thymeleaf 500 Error 오류 발생</b></summary>
<div markdown="2">

    - Caused by: org.attoparser.ParseException: Error resolving template
    - 원인: Thymeleaf layout 설정 오류 
    
 ### 💡 해결방법

    <details>
    <summary><b>기존 코드</b></summary>
    <div markdown="2">

    memberLogin.html
    ~~~
    <html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{layouts/layout1}"> // 500 Error 오류 발생
    ~~~

    </div>
</details>
    

<details>
    <summary><b>개선 코드</b></summary>
    <div markdown="2">

    memberLogin.html
    ~~~
    <html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{layout/layout1}"> // layouts > layout 으로 수정 후 개선
    ~~~


    </div>
</details>
    
</div>
</details>
    

### 👉 프로젝트 서비스 화면

### 👉 프로젝트 설명
 
도서쇼핑몰 프로젝트 생성:<a href="https://pan2468.tistory.com/105">프로젝트 생성하기 #1</a>
  






