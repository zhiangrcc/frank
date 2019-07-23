##Zhiangrcc
##Git
使用此网址
https://help.github.com/en/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
根据提示，输入github注册的邮箱和ssh密码
生成git的ssh密钥。
将ssh密钥添加到库deploy key中。此时git与github就可以根据密钥握手

在idea中配置git.exe与github账号（此步可以不用）
idea中的terminal会调用之前配置好的git.exe。git的config文件中，可以设置user.name user.email.这个email应该与github注册邮箱相同


通过git push后，通过ssh密钥握手，输入ssh创建的密码，即可上传代码


##资料

git init

git add .
或者add 某些文件

git status 显示临时库

git commit -m "first commit"

git status 为空

git push -u origin master提交

//amend表示追加 no edit表示备注文不需要更改，上方的-m后代表备注文

git commit --amend --no-edit

#初始化操作
echo "# test" >> README.md

git init

git add README.md

git commit -m "first commit"

git remote add origin git@github.com:zhiangrcc/test.git

()git push -u origin master
##工具 
