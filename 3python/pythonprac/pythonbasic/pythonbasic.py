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

