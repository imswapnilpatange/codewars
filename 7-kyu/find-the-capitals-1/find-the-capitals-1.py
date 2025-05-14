def capitals(word):
    """
    Returns a list of indices for all uppercase letters in the input string.
​
    Args:
        word (str): A non-empty string containing only lowercase and uppercase ASCII letters.
​
    Returns:
        list: A list of integer indices where uppercase letters are found.
    """
    return [index for index, char in enumerate(word) if char.isupper()]
​
# Example usage:
# word = "HelloWorld"
# print(capitals(word))
# Output: [0, 5]