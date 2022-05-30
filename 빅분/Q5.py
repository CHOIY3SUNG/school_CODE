# 5. 슬라이싱을 사용하여 다음 영역을 추출하시오.

import numpy as np

ar = np.array(range(20)).reshape(4,5)

print(ar[:2, :])
print(ar[1::2, :4])
print(ar[:, 3])
print(ar[1:, :3])