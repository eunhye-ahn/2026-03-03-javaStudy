# 2026-03-03-javaStudy

자바 문법 공부

## 1. 컬렉션 프레임워크

> List, Set, Map은 **인터페이스** / 구현체는 ArrayList, HashSet, HashMap
> 제네릭`<T>`으로 타입 명시

| 종류 | 특징 | 구현체 |
|------|------|--------|
| List | 순서 유지, 정렬 | ArrayList |
| Set | 중복 제거, 고속 존재확인 | HashSet |
| Map | key-value 고속 조회 | HashMap |

**공통 메서드**
- 추가 : `add()`, `addAll()`
- 검색 : `contains()`, `isEmpty()`, `size()`
- 삭제 : `remove()`, `clear()`
- 반환 : `toArray()`, `iterator()
  
---

## 2. 예외처리

```
Exception (최상위)
├── RuntimeException (Unchecked) → 컴파일 통과, 런타임 발생
└── Exception (Checked)          → 컴파일 단계에서 처리 강제
```

- `throw` : 예외 던지기
- `throws` : 예외 전파

---

## 3. 람다 & 스트림

## 예외처리
Exception 최상위 예외
runtimeexception(uncheckedexception) / compileexception(checkedexception)
throw 던지기 - 예외처리
throws - 예외 전파

## 람다 
| 연산 | 메서드 | 설명 |
|------|--------|------|
| 중간 | `.map()` | 요소 변환 |
| 중간 | `.filter()` | 조건 필터 |
| 중간 | `.sorted()` | 정렬 |
| 최종 | `.forEach()` | 단순 출력 |
| 최종 | `.collect()` | 결과 수집 |
| 최종 | `.reduce()` | 누적 합계/평균 |
| 최종 | `.anyMatch()` | 조건 만족 여부 |
| 최종 | `.findFirst()` | 첫 값 찾기 |

> ※ 람다의 `.map()`과 컬렉션 `Map`은 다름

---

## 4. 콜백함수

> 함수를 인자로 넘겨서, **나중에 호출되도록** 하는 함수
> 호출 타이밍을 내가 아닌 **받는 쪽이 결정**

| 종류 | 예시 |
|------|------|
| 동기 | `[1,2,3].map(x => x*2)` → 즉시 실행 |
| 비동기 | `setTimeout(() => ..., 3000)` → 3초 후 실행 |

**자주 쓰는 상황**
- 이벤트 처리 : 클릭 감지 후 실행
- 타이머 : `setTimeout`

---

## 5. 리플렉션 / 어노테이션 / DI

| 역할 | 개념 | 설명 |
|------|------|------|
| 식별자 | 어노테이션 | `@Component` 등으로 표시만 함 |
| 도구 | 리플렉션 | DI가 어노테이션을 읽을 때 사용하는 수단 |
| 실행자 | DI | 리플렉션으로 어노테이션 읽어 객체 생성 & 주입 |

```
어노테이션 (표시) → DI가 리플렉션을 도구로 읽음 → 객체 생성 & 주입
```


