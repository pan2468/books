## ๐ก ๋์ ์ฐฟ๊ธฐ ํ๋ก์ ํธ

### ๐ ํ๋ก์ ํธ ๋ชฉ์  

### ๐ ์๊ตฌ์ฌํญ ์ ์์
+ https://aeolian-caravan-34d.notion.site/PRD-2a9f36e74af14984879fce314cb2edf3

### ๐ ๊ธฐ๋ฅ์ค๋ช
+ JpaRepository ์ธํฐํ์ด์ค ์ด์ฉํ์ฌ CRUD ๊ฒ์ํ ๊ตฌํํ๊ธฐ
+ SpringSecurity ๋ก๊ทธ์ธ API ์ธ์ฆ๊ตฌํํ๊ธฐ (ex ๋ค์ด๋ฒ, ๊ตฌ๊ธ)
+ ๋๊ธ ๊ธฐ๋ฅ ๊ตฌํํ๊ธฐ

### ๐ ์ ์๊ธฐ๊ฐ / ์ฐธ์ฌ์ธ์
+ ์ ์๊ธฐ๊ฐ: 2022-08-09 ~ ์งํ
+ ์ฐธ์ฌ์ธ์: ๊ฐ์ธ ํ๋ก์ ํธ

### ๐  ์ฌ์ฉ ๊ธฐ์ (๊ธฐ์ ์คํ)
#### Back-End
+ Java 11
+ SpringBoot 2.7.1
+ SpringSecurity
+ QueryDSL
+ Gradle
+ H2 Database
+ MySQL
+ TDD

### ๐ DDD(๋๋ฉ์ธ ์ฃผ๋ ์ค๊ณ)
<img src="https://user-images.githubusercontent.com/58936137/183679108-33579fec-ff1c-428e-a42f-1b9df6e33c09.png" width="500px" height="400px">

### ๐ ํด๋์ค ๋ค์ด์ด๊ทธ๋จ

<img src="https://user-images.githubusercontent.com/58936137/183896119-20baa655-f7eb-4380-a921-c59ec8653f0a.png" width="500px" height="400px">

### ๐ก ํต์ฌ๊ธฐ๋ฅ
<details>
<summary><b>์ฐ๊ด ๊ด๊ณ ๋ค๋์ผ ๋งคํ</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>๋ฉ์ธ ํ๋ฉด ๊ฒ์์์ง(ElasticSearch) ์ ์ฉ</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>Query DSL ์ ์ฉ</b></summary>
<div markdown="2">

</div>
</details>

<details>
<summary><b>TDD (ํ์คํธ ์ฃผ๋ ๊ฐ๋ฐ)</b></summary>
<div markdown="2">

</div>
</details>


### ๐ ํธ๋ฌ๋ธ ์ด์


<details>
<summary><b>500 Error Controller ์ค๋ฅ ๋ฐ์</b></summary>
<div markdown="2">

- Caused by: java.lang.IllegalStateException: Ambiguous mapping. Cannot map 'restfulController' method  
- ์์ธ: RestController๊ณผ MemberController @GetMapping(/login) url์ login ์ค๋ณต์ผ๋ก ์ค๋ฅ ๋ฐ์

### ๐ก ํด๊ฒฐ๋ฐฉ๋ฒ

<details>
<summary><b>๊ธฐ์กด ์ฝ๋</b></summary>
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
<summary><b>๊ฐ์  ์ฝ๋</b></summary>
<div markdown="2">

MemberController.class
~~~
    @GetMapping("/logins") // ์์  ํ ๊ฐ์ 
    public String login(){

        return "member/memberLogin";
    }

~~~

</div>
</details>


</div>
</details>


<details>
<summary><b>Thymeleaf 500 Error ์ค๋ฅ ๋ฐ์</b></summary>
<div markdown="2">

- Caused by: org.attoparser.ParseException: Error resolving template
- ์์ธ: Thymeleaf layout ์ค์  ์ค๋ฅ 
    
 ### ๐ก ํด๊ฒฐ๋ฐฉ๋ฒ

<details>
    <summary><b>๊ธฐ์กด ์ฝ๋</b></summary>
    <div markdown="2">

memberLogin.html        
~~~
    <html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{layouts/layout1}"> // 500 Error ์ค๋ฅ ๋ฐ์
~~~

  </div>
</details>
    

<details>
    <summary><b>๊ฐ์  ์ฝ๋</b></summary>
    <div markdown="2">

memberLogin.html
~~~
    <html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{layout/layout1}"> // layouts > layout ์ผ๋ก ์์  ํ ๊ฐ์ 
~~~


  </div>
</details>
    
</div>
</details>

<details>
    <summary><b>layout ์ค๋ฅ</b></summary>
    <div markdown="2">

- Caused by: org.attoparser.ParseException:
    
</div>
</details>    

### ๐ ํ๋ก์ ํธ ์๋น์ค ํ๋ฉด

### ๐ ํ๋ก์ ํธ ์ค๋ช
 
๋์์ผํ๋ชฐ ํ๋ก์ ํธ ์์ฑ:<a href="https://pan2468.tistory.com/105">ํ๋ก์ ํธ ์์ฑํ๊ธฐ #1</a>
  






