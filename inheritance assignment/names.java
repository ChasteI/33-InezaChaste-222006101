      class names {
        void nom(){
            System.out.println("Ineza Chaste");   
        }
          
        }
         class gender extends names{
            void genre(){
                System.out.println("Female");
            }
        }
         class age extends gender{
            void idade(){
                System.out.println("100 years of age");
            }
         }
         interface keva{
            void show();
         }
         class t extends names implements keva{
        public void show(){
            }
        }
         class inheritance{
            public static void main(String[] args) {
                age G= new age();
                G.nom();
                G.genre();
                G.idade();
                System.out.println("Thanks for reading");
                
        
                 }
        }
    
