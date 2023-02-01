### 흐름제어

* if (A)
    - 만약에 ~이라면 A를 실행
* if (A) / else if(B)
    - 만약에 A 이라면 A1을(를) 하고 만약에 B라면 B1을(를) 실행
* if (A) / else if(B) / else
    - 만약에 A 이라면 A1을(를) 하고 만약에 B라면 B1을(를) 그리고 나머지 경우에는 C를 실행    

```
-if 문법
    if(조건){ 
        동작1
    }else if(조건){
        동작2
    }else if(조건){
        동작3
    }else{
        동작4
    }
```    

- else if는 여러개 사용 할 수 있다
- if 와 else는 1개만 사용 할 수 있다.
- else와 else if는 필요하지 않으면 사용하지 않을 수 있다

```
* when
    when (조건을 검사할 값){
        case1 -> 동작1
        case2 -> 동작2
        else -> 동작3
    }
```