DELETE
FROM vendors;

DELETE
FROM userposts;

DELETE
FROM weddingfoliousers;

DELETE
FROM weddingthemes;

INSERT INTO weddingfoliousers
(
    id
    password,
    firstName,
    lastName,
    email,
    city,
    state
)
VALUES
(1, 'door', 'John', 'Doe', 'johndoe@gmail.com', 'Austin', 'TX')
,(2, 'temppass', 'Sally', 'May', 'sallymay@gmail.com', 'Boston', 'NY');

INSERT INTO weddingthemes
(id, weddingtheme)
VALUES
(1, 'Rustic')
,(2, 'Luau');

INSERT INTO userposts
(
    id,
    description,
    city,
    state,
    imageURL,
    userId,
    themeId
)
VALUES
(
    1,
    'Bacon ipsum dolor amet jowl ham tri-tip, turducken pork chop sirloin flank short loin alcatra chicken shoulder tail turkey short ribs cupim. Beef ribs chislic tail short ribs venison capicola ground round porchetta. Andouille pancetta t-bone beef ribs, short ribs doner beef sirloin capicola pastrami meatloaf pork loin pig tail. Andouille kevin buffalo porchetta',
    'Austin',
    'TX',
    'https://source.unsplash.com/random',
    1,
    1
 )
,(
    2,
    'Bacon ipsum dolor amet jowl ham tri-tip, turducken pork chop sirloin flank short loin alcatra chicken shoulder tail turkey short ribs cupim. Beef ribs chislic tail short ribs venison capicola ground round porchetta. Andouille pancetta t-bone beef ribs, short ribs doner beef sirloin capicola pastrami meatloaf pork loin pig tail. Andouille kevin buffalo porchetta',
    'Austin',
    'TX',
    'https://source.unsplash.com/random',
    2,
    1
 )
 ,(
    3,
    'Bacon ipsum dolor amet jowl ham tri-tip, turducken pork chop sirloin flank short loin alcatra chicken shoulder tail turkey short ribs cupim. Beef ribs chislic tail short ribs venison capicola ground round porchetta. Andouille pancetta t-bone beef ribs, short ribs doner beef sirloin capicola pastrami meatloaf pork loin pig tail. Andouille kevin buffalo porchetta',
    'Austin',
    'TX',
    'https://source.unsplash.com/random',
    2,
    2
)

INSERT INTO vendors
(id, name, postid)
VALUES
(1, 'DiskJockey Majors', 1)

alter sequence hibernate_sequence restart with 15;