### 콜렉션(Collection)

- 크기가 고정되어 있지 않다(초기 크기 설정/생략가능)
- 변경가능 여부
    - Mutable -> 변경 가능
    - Immutable -> 변경 불가능
    
※ Tip, 기본적으로 불변한 immutable을 사용하는 것이 좋다

- 특징으로 분리
    - List
        - Mutable, Immutable  
    - Set
        - Mutable, Immutable
    - Map
        - Mutable, Immutable
    
* List
```
    - mutable
        - 형태
            - mutableListOf<자료형>(값1,값2,값3)
            - val numbers = mutableListOf<Int>(1,2,3)
    - immutable
        - 형태
            - listOf<자료형>(값1,값2,값3)
            - val numbers = listOf<Int>(1,2,3)
```

* Set
```  
    - 집합 -> 똑같은 값을 허락하지 않는다
    - mutable
        - 형태
            - mutableSetOf<자료형>(값1,값2,값3,값1,값1)
    - immutable
        - 형태
            - setOf<자료형>(값1,값2,값3,값1,값1) -> setOf(값1,값2,값3)
```

* Map
```  
    - 키-값 (key-value) -> 저장 방법
    - mutable
        - 형태
            - mutableOfMap<자료형,자료형>(key1 to value1, key2 to value2,...)
    - immutable
        - 형태
            - mapOf<자료형,자료형>(key1 to value1, key2 to value2,...)
            - var numbers = mapOf<String, String)("1" to "일", "2" to "이",...)
```