print(8/5)
print(17/3)
print(17//3) # division always returns a floating point number
print(5**2)# 5 squared
print(2**7)#2 to the power of 7
#n  # try to access an undefined variable
print(4 * 3.75 - 1)
tax = 12.5/100
price = 100.50
# price + _ 대화형 모드에서는 가능.
print(price * tax)

print('C:\some\name')  # here \n means newline!
print(r'C:\some\name')  # note the r before the quote

# """...""" 또는 '''...'''. 줄 넘김 문자는 자동으로 문자열에 포함됩니다.
# 하지만 줄 끝에 \ 를 붙여 이를 방지할 수도 있습니다.
print("""\
Usage: thingy [OPTIONS]
     -h                        Display this usage message
     -H hostname               Hostname to connect to
""")

# 문자열은 + 연산자로 이어붙이고, * 연산자로 반복시킬 수 있습니다:
print(3 * 'un' + 'ium')

# 두 개 이상의 문자열 리터럴 (즉, 따옴표로 둘러싸인 것들) 가
# 연속해서 나타나면 자동으로 이어 붙여집니다.
print('Py''thon')
# 이것은 오직 두 개의 리터럴에만 적용될 뿐 변수나 표현식에는 해당하지 않습니다

# 문자열은 인덱스 (서브 스크립트) 될 수 있습니다.
# 첫 번째 문자가 인덱스 0에 대응됩니다.
# 문자를 위한 별도의 형은 없습니다 단순히 길이가 1인 문자열입니다
word = 'Python'
print(word[0])
print(word[5])
# 인덱스는 음수가 될 수도 있는데, 끝에서부터 셉니다
print(word[-1])
print(word[-2])
print(word[-6])
# -0은 0과 같으므로, 음의 인덱스는 -1에서 시작한다는 것에 주목하세요.

# 인덱싱에 더해 슬라이싱(slicing) 도 지원됩니다.
# 인덱싱이 개별 문자를 얻는데 사용되는 반면,
# 슬라이싱 은 부분 문자열(substring)을 얻는 데 사용됩니다
print(word[0:2])
print(word[2:5])

#시작 위치의 문자는 항상 포함되는 반면,
# 종료 위치의 문자는 항상 포함되지 않는 것에 주의하세요.
# 이 때문에 s[:i] + s[i:] 는 항상 s 와 같아집니다
print(word[:2])
print(word[4:])
print(word[-2:])
# +---+---+---+---+---+---+
# | P | y | t | h | o | n |
# +---+---+---+---+---+---+
# 0   1   2   3   4   5   6
#-6  -5  -4  -3  -2  -1

#너무 큰 값을 인덱스로 사용하는 것은 에러입니다
# print(word[42])
# 하지만, 범위를 벗어나는 슬라이스 인덱스는 슬라이싱할 때 부드럽게 처리됩니다
print(word[4:42])
print(word[42:])

#파이썬 문자열은 변경할 수 없다
# — 불변 이라고 합니다.
# 그래서 문자열의 인덱스로 참조한 위치에 대입하려고 하면 에러를 일으킵니다:
# word[0] = 'J'
# word[2:] = 'py'

# 다른 문자열이 필요하면,
# 새로 만들어야 합니다
word = 'J' + word[1:]
print(word)
word = word[:2] + 'py'
print(word)

# 내장 함수 len() 은 문자열의 길이를 돌려줍니다
s = 'supercalifragilisticexpialidocious'
print(len(s))

# 파이썬은 다른 값들을 덩어리로 묶는데 사용되는 여러 가지 컴파운드 (compound) 자료 형을 알고 있습니다.
# 가장 융통성이 있는 것은 리스트 인데,
# 대괄호 사이에 쉼표로 구분된 값(항목)들의 목록으로 표현될 수 있습니다.
# 리스트는 서로 다른 형의 항목들을 포함할 수 있지만, 항목들이 모두 같은 형인 경우가 많습니다.
squares = [1, 4, 9, 16, 25]
print(squares[0])

# 문자열(그리고, 다른 모든 내장 시퀀스 형들)처럼 리스트는 인덱싱하고 슬라이싱할 수 있습니다
print(squares[-3:])

# 이는 다음과 같은 슬라이스가 리스트의 새로운 얕은 복사본을 돌려준다는 뜻입니다:
print(squares[:])

# 리스트는 이어붙이기 같은 연산도 지원합니다
print(squares + [36, 49, 64, 81, 100])

# 불변 인 문자열과는 달리, 리스트는 가변 입니다. 즉 내용을 변경할 수 있습니다
cubes = [1, 8, 27, 65, 125]
cubes[3] = 64
print(cubes)

# append() 메서드 (method) (나중에 메서드에 대해 더 자세히 알아볼 것입니다) 를 사용하면 리스트의 끝에 새 항목을 추가할 수 있습니다
cubes.append(216)  # add the cube of 6
cubes.append(7 ** 3)  # and the cube of 7
print(cubes)

# 슬라이스에 대입하는 것도 가능한데, 리스트의 길이를 변경할 수 있고, 모든 항목을 삭제할 수조차 있습니다
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g']
print(letters)
letters[2:5] = ['C', 'D', 'E']
print(letters)
letters[2:5] = []
print(letters)
letters[:] = []
print(letters)

# 내장 함수 len() 은 리스트에도 적용됩니다
letters = ['a', 'b', 'c', 'd']
print(len(letters))

# 리스트를 중첩할 수도 있습니다. (다른 리스트를 포함하는 리스트를 만듭니다). 예를 들어
a = ['a', 'b', 'c']
n = [1, 2, 3]
x = [a, n]
print(x)
[['a', 'b', 'c'], [1, 2, 3]]
print(x[0])
['a', 'b', 'c']
print(x[0][1])
'b'

# 다음처럼 피보나치 수열의 앞부분을 계산할 수 있습니다
# Fibonacci series:
# the sum of two elements defines the next
a, b = 0, 1
while a < 10:
    print(a)
    a, b = b, a+b
# 첫 줄은 다중 대입 을 포함하고 있습니다

i = 256*256
print('The value of i is', i)

x = int(input("Please enter an integer: "))

if x < 0:
     x = 0
     print('Negative changed to zero')
elif x == 0:
     print('Zero')
elif x == 1:
     print('Single')
else:
     print('More')

# Measure some strings:
words = ['cat', 'window', 'defenestrate']
for w in words:
    print(w, len(w))

# 컬렉션을 이터레이트 하는 동안 같은 컬렉션을 수정하는 코드는 올바르게 동작하도록 만들기 힘듭니다.
# 대신, 보통 컬렉션의 복사본으로 루프를 만들거나 새 컬렉션을 만드는 것이 더 간단합니다
# Strategy:  Iterate over a copy
# for user, status in users.copy().items():
#     if status == 'inactive':
#         del users[user]
#
# # Strategy:  Create a new collection
# active_users = {}
# for user, status in users.items():
#     if status == 'active':
#         active_users[user] = status

# 숫자들의 시퀀스로 이터레이트할 필요가 있으면, 내장 함수 range()가 편리합니다
for i in range(5):
     print(i)

for i in range(5, 10):
    print(i)

for i in range(0, 10, 3):
    print(i)
for i in range(-10, -100, -30):
    print(i)

# break 문은, C처럼, 가장 가까이서 둘러싸는 for 나 while 루프로부터 빠져나가게 만듭니다.
for n in range(2, 10):
     for x in range(2, n):
         if n % x == 0:
             print(n, 'equals', x, '*', n//x)
             break
     else:
         # loop fell through without finding a factor
         print(n, 'is a prime number')

#루프와 함께 사용될 때, else 절은 if 문보다는 try 문의 else 절과 비슷한 면이 많습니다:
# try 문의 else 절은 예외가 발생하지 않을 때 실행되고,
# 루프의 else 절은 break가 발생하지 않을 때 실행됩니다.
# try 문과 예외에 관한 자세한 내용은 예외 처리하기 를 보세요


#continue 문은, 역시 C에서 빌렸습니다, 루프의 다음 이터레이션에서 계속하도록 만듭니다
for num in range(2, 10):
     if num % 2 == 0:
         print("Found an even number", num)
         continue
     print("Found a number", num)

#pass 문은 아무것도 하지 않습니다. 문법적으로 문장이 필요하지만,
# 프로그램이 특별히 할 일이 없을 때 사용할 수 있습니다.
# 예를 들어
#while True:
 #    pass  # Busy-wait for keyboard interrupt (Ctrl+C)

#최소한의 클래스를 만들 때 흔히 사용됩니다
class MyEmptyClass:
     pass

#pass가 사용될 수 있는 다른 장소는 새 코드를 작업할 때 함수나 조건부 바디의 자리를 채우는 것인데,
# 여러분이 더 추상적인 수준에서 생각할 수 있게 합니다.
# pass 는 조용히 무시됩니다

# 피보나치 수열을 임의의 한도까지 출력하는 함수를 만들 수 있습니다
def fib(n):    # write Fibonacci series up to n
     """Print a Fibonacci series up to n."""
     a, b = 0, 1
     while a < n:
         print(a, end=' ')
         a, b = b, a+b
     print(a)

 # Now call the function we just defined:
fib(2000)

#키워드 def는 함수 정의를 시작합니다.
# 함수 이름과 괄호로 싸인 형식 매개변수들의 목록이 뒤따릅니다.
# 함수의 바디를 형성하는 문장들이 다음 줄에서 시작되고, 반드시 들여쓰기 되어야 합니다
print(fib)

def fib2(n):
    """Return a list containing the Fibonacci series up to n."""
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)  # see below
        a, b = b, a + b
    return result
f100 = fib2(100)
print(f100)

#가장 쓸모 있는 형식은 하나나 그 이상 인자들의 기본값을 지정하는 것입니다.
# 정의된 것보다 더 적은 개수의 인자들로 호출될 수 있는 함수를 만듭니다.
def ask_ok(prompt, retries=4, reminder='Please try again!'):
    while True:
        ok = input(prompt)
        if ok in ('y', 'ye', 'yes'):
            return True
        if ok in ('n', 'no', 'nop', 'nope'):
            return False
        retries = retries - 1
        if retries < 0:
            raise ValueError('invalid user response')
        print(reminder)

#이 함수는 여러 가지 방법으로 호출될 수 있습니다:
#오직 꼭 필요한 인자만 전달해서: ask_ok('정말 끝내길 원하세요?')
#선택적 인자 하나를 제공해서: ask_ok('파일을 덮어써도 좋습니까?', 2)
#또는 모든 인자를 제공해서: ask_ok('파일을 덮어써도 좋습니까?', 2, '자, 예나 아니요로만 답하세요!')
ask_ok('정말 끝내길 원하세요?')
ask_ok('파일을 덮어써도 좋습니까?', 2)
ask_ok('파일을 덮어써도 좋습니까?', 2, '자, 예나 아니요로만 답하세요!')

# 이 예는 in 키워드도 소개하고 있습니다. 시퀀스가 어떤 값을 가졌는지 아닌지를 검사합니다.
# 기본값은 함수 정의 시점에 정의되고 있는 스코프에서 구해집니다
i = 5
def f(arg=i):
    print(arg)
i = 6
f()

#중요한 주의사항:
# 기본값은 오직 한 번만 값이 구해집니다.
# 이것은 기본값이 리스트나 딕셔너리나 대부분 클래스의 인스턴스와 같은 가변 객체일 때 차이를 만듭니다.
# 예를 들어, 다음 함수는 계속되는 호출로 전달된 인자들을 누적합니다

def f(a, L=[]):
    L.append(a)
    return L

print(f(1))
print(f(2))
print(f(3))

# 연속된 호출 간에 기본값이 공유되지 않기를 원한다면, 대신 함수를 이런 식으로 쓸 수 있습니다
def f(a, L=None):
    if L is None:
        L = []
    L.append(a)
    return L
print(f(1))
print(f(2))
print(f(3))

# 함수는 kwarg=value 형식의 키워드 인자 를 사용해서 호출될 수 있습니다. 예를 들어, 다음 함수는
def parrot(voltage, state='a stiff', action='voom', type='Norwegian Blue'):
    print("-- This parrot wouldn't", action, end=' ')
    print("if you put", voltage, "volts through it.")
    print("-- Lovely plumage, the", type)
    print("-- It's", state, "!")
# 하나의 필수 인자(voltage)와 세 개의 선택적 인자 (state, action, type) 를 받아들입니다.
# 이 함수는 다음과 같은 방법 중 아무것으로나 호출될 수 있습니다.
parrot(1000)                                          # 1 positional argument
parrot(voltage=1000)                                  # 1 keyword argument
parrot(voltage=1000000, action='VOOOOOM')             # 2 keyword arguments
parrot(action='VOOOOOM', voltage=1000000)             # 2 keyword arguments
parrot('a million', 'bereft of life', 'jump')         # 3 positional arguments
parrot('a thousand', state='pushing up the daisies')  # 1 positional, 1 keyword

# 하지만 다음과 같은 호출들은 모두 올바르지 않습니다:
parrot()                     # required argument missing
parrot(voltage=5.0, 'dead')  # non-keyword argument after a keyword argument
parrot(110, voltage=220)     # duplicate value for the same argument
parrot(actor='John Cleese')  # unknown keyword argument

# 함수 호출에서, 키워드 인자는 위치 인자 뒤에 나와야 합니다.
# 전달된 모든 키워드 인자는 함수가 받아들이는 인자 중 하나와 맞아야 하며
# (예를 들어, actor는 parrot 함수의 올바른 인자가 아니다), 그 순서는 중요하지 않습니다.
# 이것들에는 필수 인자들도 포함됩니다 (예를 들어, parrot(voltage=1000) 도 올바릅니다).
# 어떤 인자도 두 개 이상의 값을 받을 수 없습니다. 여기, 이 제약 때문에 실패하는 예가 있습니다

def function(a):
     pass
function(0, a=0)

# **name 형식의 마지막 형식 매개변수가 존재하면,
# 형식 매개변수들에 대응하지 않는 모든 키워드 인자들을 담은 딕셔너리 (매핑 형 — dict 를 보세요) 를 받습니다.
# 이것은 *name (다음 서브섹션에서 설명합니다) 형식의 형식 매개변수와 조합될 수 있는데,
# 형식 매개변수 목록 밖의 위치 인자들을 담은 튜플을 받습니다.
# (*name은 **name 앞에 나와야 합니다.) 예를 들어, 이런 함수를 정의하면
def cheeseshop(kind, *arguments, **keywords):
    print("-- Do you have any", kind, "?")
    print("-- I'm sorry, we're all out of", kind)
    for arg in arguments:
        print(arg)
    print("-" * 40)
    for kw in keywords:
        print(kw, ":", keywords[kw])

cheeseshop("Limburger", "It's very runny, sir.",
           "It's really very, VERY runny, sir.",
           shopkeeper="Michael Palin",
           client="John Cleese",
           sketch="Cheese Shop Sketch")

