import pandas as pd

data = {'kor' : [80, 90, 70, 30], 'eng' : [90, 70, 60, 40], 'math' : [90, 60, 80, 70]}
columns = ['kor', 'eng', 'math']
index = ['yes', 'jin', 'jae', 'hyuk']
df = pd.DataFrame(data, index=index, columns=columns)

# 모든 학생의 수학 점수를 시리즈로 나타낸다.
sd = df['math']
print(sd)
print(type(sd))

# 모든 학생의 국어와 영어 점수를 데이터 프레임으로 나타낸다.
# df1 = df[:]
# df1.drop('math', axis=1, inplace=True)
# print(df1, end="\n")
print(df[['kor', 'eng']])

# 모든 학생의 각 과목 평균 점수를 새로운 열로 출력한다.
df['평균']=df.mean(axis=1)
print(df)

# hyuk의 영어 점수를 80점으로 바꿔라.
df.loc['hyuk','eng'] = 80
# df.iloc[3,1] = 80
df['평균']=df.mean(axis=1)
print(df)

# yes의 점수를 데이터 프레임으로 나타낸다.
print(df[:1])
print(type(df[:1]))

# jae의 점수를 시리즈로 나타낸다.
print(df.loc["jae"])
print(type(df.loc["jae"]))