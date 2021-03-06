package com.aldado.domain.admin;


import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Tickets {

    private String ticket;


    private Tickets(){

    }
    private Tickets(Builder builder){
        this.ticket = builder.ticket;

    }

    public String getTicket(){
        return ticket;
    }

    public static class Builder{

        private String ticket;

        public Tickets.Builder ticket(String ticket){
            this.ticket = ticket;
            return this;

        }

        public Builder copy(Tickets tickets) {
            this.ticket = tickets.ticket;
            return this;
        }

        public Tickets build(){
            return new Tickets(this);
        }
    }

    @Override
    public String toString() {
        return "Tickets{" + "ticket = " + ticket + '}';
    }
}
