n=5
first=0
second=1
print(first)
print(second)
for i in range(n):
    fib=first+second
    first=second
    second=fib
    print(fib)
