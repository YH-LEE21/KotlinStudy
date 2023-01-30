### 02. 자료형

***

```
1. 정수형
    - 음수,양수 모두 표현
        - Byte (-128 ~ +127)
        - Short (-32768 ~ +32767)
        - Int
           - 가장 많이 사용하는 정수 자료형
        - Long
           - Byte에서 Long으로 갈수록 표현 할 수 있는 숫자의 범위가 넓다 
   
    - 양수만 표현    
        - UByte (0 ~ 255)
        - UShort (0 ~65535)
        - UInt
        - ULong
    
2. 실수형
    - Float -> 4byte
    - Double -> 8byte

3. 논리형(참, 거짓)
    - Boolean
    - 참,거짓,True,False를 표현할 수 있다

4. 문자형
    - 한문자
        - ex) 'A','가'
5. 문자열형
    -여러 글자
        - ex) "안녕하세요","Hello"
```

***

#### 자료형 추론
var changeYes:Int = 100
-> var/val 변수명 : 자료형 = 값
var changeYes = 100
-> 정수의 경우 코틀린은 기본적으로 Int로 추론한다

* 추론힌트를 주는 방법 kotlin == java
/*이런 방법도 있다는 정도만 알면됨*/
var number1 = 100 -> Int
var number1 = 100L -> Long
var number1 = 0x100 -> 16진수 표기가 사용된 Int형으로 추론
var number4 = 200u -> UByte
  
* 자료형 추론을 사용하지 말고, 변수를 선언할때 자료형을 적어주는 습관을 들이면 좋다!!

팁
- 큰 숫자를 할당 할때 _(언더바)로 구분 할 수 있다
val bigNumber:Int = 1_123_456_789_123_456_789 
