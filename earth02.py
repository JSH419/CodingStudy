import matplotlib as mpl        # 별칭은 mpl
import matplotlib.pyplot as plt # mataplotlib 모듈의 서브 모듈
'''
 레이블을 가진 이차원 평면에서의 선차트 작성
'''
plt.plot([0,1,2,3,4,5,6],[1,2,3,4,5,6,7])   #x값의 범위 생략 가능
plt.plot(3,3)
plt.ylabel('y label')           # y축 레이블 (속성)
plt.xlabel('x label')
plt.show()

''' 막대그래프 
import matplotlib.pyplot as plt

x = ['A', 'B', 'C', 'D', 'E']
y = [10, 7, 15, 8, 12]

plt.bar(x, y)
plt.xlabel('x label')
plt.ylabel('y label')
plt.show()
'''