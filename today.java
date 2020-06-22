//sa// 
bank_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bankCardd= new Intent(MainActivity.this, scienceOne.class);
                startActivity(bankCardd);
            }
        });


        ideas_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ideasCardd= new Intent(MainActivity.this, cmathOne.class);
                startActivity(ideasCardd);
            }
        });
        add_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addCardd  = new Intent(MainActivity.this, omathOne.class);
                startActivity(addCardd);
            }
        });
        link_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkCardd= new Intent(MainActivity.this, gamesOne.class);
                startActivity(linkCardd);
            }
        });
