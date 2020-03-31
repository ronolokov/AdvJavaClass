# Git Recap


To iniliaze git we should type
```sh
git init
```

it will create a .git folder which will track all your files

`.gitignore` file will contain all files and folders which should be ignored by git

`ls -la` this will show all hiddens

unix has text editor vi or vim, which will be in terminal


`Working Directory`  - `git add` -> `Staging area, Index`   -> `Head, History, Local repo`


`HEAD` is pointer to top commit or latest commit


if I want to connect local repo to remote 
```sh
git remote add origin <url>
```

If I don't have local repo then you can download by

```sh
git clone <url>
```
it is not just downloaded but also it is connecting for future actions

to check remote repo of local repo

```sh
git remote -v
```

`$PATH` will show all paths for commands 
to add PATH open `~/.bash_profile` and add `export PATH=$PATH:location`