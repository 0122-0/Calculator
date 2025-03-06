> # 발제 계산기 만들기!

<h1>🖥️ 프로젝트 소개</h1>

---

- JAVA로 계산기를 만들어보자!<br>

---

<h1>🕰️ 개발 기간</h1>

---
- 25.02.25일 - 25.03.06일

---
<h1>⚙️ 개발 환경</h1>

- `JAVA`
- `JDK 17.0.14`
---
<h1>📌 주요 기능</h1>
<br>
- 숫자 받기
- 사칙 연산 입력하기
- 계산한 결과보기
- 다시시작 및 종료

---

<h1>Lv1계산기 프로젝트 구상</h1>
<br>
- 첫번째 수 입력 > 사칙연산 입력 > 두번째 수 입력 > 결과값 보기 > 다시 처음으로 돌아가기 or 작동정지

---

1️⃣ 첫번째 수 입력 :

![계산기1](https://github.com/user-attachments/assets/2f24ae4c-4894-472f-aa62-a5922bd15bc1)

2️⃣ 사칙연산 입력 :

![계산기2](https://github.com/user-attachments/assets/5b464a02-3fa4-4770-8de8-4d86b60b09fc)

![계산기3](https://github.com/user-attachments/assets/2c3b8b0c-8844-4d76-ba4c-36c49311b5c5)

3️⃣ 두번째 수 입력 :

![계산기4](https://github.com/user-attachments/assets/6538e205-5fd3-4003-a867-d71f5588d000)

4️⃣ 결과 값보기 :

![계산기5](https://github.com/user-attachments/assets/dc72478a-8955-4e40-929d-e10ee433f467)

5️⃣ 계산기 재작동 or 작동정지

![계산기6](https://github.com/user-attachments/assets/77269928-4a2a-4e2d-a869-274e4077af52)

---

전체를 큰 while 문을 이용해서 다시 반복할수있도록 설계

---

<h2>Lv1계산기의 트러블슈팅</h2>

```java
if (type.length() == 1) {
                    type1 = type.charAt(0);

                } else {
                    System.out.println("잘못된 입력값입니다.");
                    continue;
                }
                if (type1 == '+' || type1 == '-' || type1 == '*' || type1 == '/') {
                    wrongnum2 = false;
                } else {
                    System.out.println("잘못된 입력값입니다.");
                }
```
`type`을 읽을때에 +a 라는 값을 입력을 해도 작동하는 오류가 발생하여 한글자만 읽힐 수 있도록 변경 해서 오류를 수정함

---
<h1>Lv2계산기 프로젝트 구상</h1>
<br>

 `Calss` 를 주어서 `Main` 에 작동 하게 해보기
- 첫번째 수 입력 > 사칙연산 입력 > 두번째 수 입력 > 결과값 보기 > 다시 처음으로 돌아가기 or 작동정지
- 작동 방식은 Lv 1과 동일
- 추가된 부분 `getter` 와 `setter`를 이용해보기 ! (결과값을 추가 수정)

---
![Lv2 Main](https://github.com/user-attachments/assets/3db347d1-5045-4e44-a17e-f0be84b1db5f)

1️⃣ 첫번째 수 입력 :

![Lv2 첫번째 수 입력](https://github.com/user-attachments/assets/e9c63001-8586-4047-a4be-be6b8195f3aa)

2️⃣ 사칙연산 입력 :

![Lv2 사칙연산 1](https://github.com/user-attachments/assets/0cdff30b-22a8-4929-9153-c9ac91915bf5)

3️⃣ 두번째 수 입력 :

![Lv2 두번째 수 입력](https://github.com/user-attachments/assets/6769a090-49d4-4abc-8817-4771ae2df6f3)

4️⃣ 결과 값보기 :

![Lv2 계산 값 받기](https://github.com/user-attachments/assets/ec4069d8-80a0-4051-a292-27e8d9d88cc0)

5️⃣ 계산기 재작동 or 작동정지

![Lv2 끝내기](https://github.com/user-attachments/assets/13a990c6-141f-404b-867c-e8cedcd63e2e)

6️⃣ 추가된 기능 

![Lv2 인덱스 추가및 수정 1](https://github.com/user-attachments/assets/b5c3abeb-5f83-4848-94fb-600abe71cf5b)

![Lv2 인덱스 추가및 수정 2](https://github.com/user-attachments/assets/b82dc3d3-f734-4993-aa7f-f6fc13e70b42)

---
<h2>Lv2계산기의 트러블슈팅</h2>

---

```java
//변경 전
boolean exitflag = true;
int a = 0;
int b = 0;
//변경 후
// whlie 조건 변경
while (a<0)
int a = -1;
int b = -1;
```
변경 전에는 `while` 문에도 `boolean` 변수로 `true` 값을 해두었을 때는 `JAVA`에서 첫번째 수의 입력값을 임의로 쓰지 않는다고 판단해서 값이 소멸
변경 후에는 `int a`와 `int b`가 조건이 맞는지 계속 확인하게 되면서 `int a,b`값이 유지 되어서 작동
