import pandas as pd

df = pd.DataFrame([[15, "남", "덕영중"], [17, "여", "수리중"]], index=["준서", "예은"], columns=["나이", "성별", "학교"])

print(df, end="\n")
print(df.index, end="\n")
print(df.columns, end="\n")
