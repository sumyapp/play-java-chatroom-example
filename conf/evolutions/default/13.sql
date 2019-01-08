# User 変更
 
# --- !Ups
ALTER TABLE User ADD avatorURL string;
 
# --- !Downs
ALTER TABLE User DROP avatorURL;
