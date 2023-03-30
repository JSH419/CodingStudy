def BMI(h, w):
    h_m = h / 100
    BMI = w / (h_m **2)
    BMI2 = round(BMI, 2)

    if BMI < 20:
        BODYTYPE = "저체중"
    elif 20 <= BMI < 25:
        BODYTYPE = "정상"
    elif 25 <= BMI < 30:
        BODYTYPE = "과체중"
    else:
        BODYTYPE = "비만"

    return BMI, BODYTYPE

h = float(input("키 :"))
w = float(input("체중 :"))

BMI2, BODYTYPE = BMI(h,w)
print("bmi지수 :", BMI2, f"상태: {BODYTYPE}")