h, m = map(int, input().split());
if m >= 45:
  print(h, m-45);
else:
  if h-1 >= 0:
    print(h-1, 60-(45-m));
  else:
    print(24+(h-1), 60-(45-m));
