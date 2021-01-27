animals = ['cat', 'dog', 'monkey']
for animal in animals:
    print(animal)

print("******************************")

animals = ['cat', 'dog', 'monkey']
for idx, animal in enumerate(animals):
    print('#{}: {}'.format(idx + 1, animal))