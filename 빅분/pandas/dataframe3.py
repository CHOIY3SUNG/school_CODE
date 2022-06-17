import pandas as pd

exam_data = {'math' : [90,80,70], 'eng' : [98,100,95], 'music' : [85, 95, 100], 'p.e' : [100, 90, 90]}
df = pd.DataFrame(exam_data, index=['yesung', 'jinyang', 'jaewoo'])

print(df, end="\n")

df2 = df[:]
df2.drop('jinyang', inplace=True)
print(df2, end="\n")

df3 = df[:]
df3.drop(['jinyang', 'jaewoo'], inplace=True)
print(df3, end="\n")

df4 = df[:]
df4.drop('math', axis=1, inplace=True)
print(df4, end="\n")

df5 = df[:]
df5.drop(['math', 'eng'], axis=1, inplace=True)
print(df5, end="\n")